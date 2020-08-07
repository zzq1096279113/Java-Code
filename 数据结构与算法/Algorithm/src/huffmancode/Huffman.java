package huffmancode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 哈夫曼编码过程
 * @ClassName Huffman
 * @Author zzq
 * @Date 2020/8/7 17:14
 */
class Huffman {

    static HashMap<Byte, String> huffmanCodes = new HashMap<>();

    /**
     * @Description 压缩总流程
     * @Param [bytes]
     * @Return byte[]
     * @Author zzq
     * @Date 2020/8/7 18:00
     */
    public static byte[] huffmanZip(byte[] bytes) {
        ArrayList<Node> nodeList = Huffman.getList(bytes);  //将数组统计并处理成ArrayList
        Node node = Huffman.creatHuffmanTree(nodeList);     //将ArrayList处理成哈夫曼树
        HashMap<Byte, String> path = Huffman.getCodes(node);    //得到哈夫曼编码
        return Huffman.zip(bytes, path);    //根据哈夫曼编码压缩原字节数组，返回压缩后的字节数组
    }

    /**
     * @Description 接收字符串统计各个字符的个数到ArrayList
     * @Param [bytes]
     * @Return java.util.ArrayList<huffmancode.Node>
     * @Author zzq
     * @Date 2020/8/7 14:20
     */
    public static ArrayList<Node> getList(byte[] bytes) {
        ArrayList<Node> nodes = new ArrayList<>();
        HashMap<Byte, Integer> map = new HashMap<>();
        for (byte b : bytes)    //遍历字节数组中每个字节
            map.merge(b, 1, Integer::sum);      //如果map中不存在字符，加入map并默认为1；如果map中存在字符，在原来数量上+1
        for (Map.Entry<Byte, Integer> entry : map.entrySet())       //entrySet遍历map
            nodes.add(new Node(entry.getKey(), entry.getValue()));  //取出相应的键值对，创建Node对象加入链表
        return nodes;
    }

    /**
     * @Description 根据传入的ArrayList创建哈夫曼树，返回哈夫曼树的根节点
     * @Param [nodes]
     * @Return huffmancode.Node
     * @Author zzq
     * @Date 2020/8/7 14:33
     */
    public static Node creatHuffmanTree(ArrayList<Node> nodes) {
        Node left;
        Node right;
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            left = nodes.get(0);        //取出ArrayList中最小的二叉树
            right = nodes.get(1);       //取出ArrayList中第二小的二叉树
            Node parent = new Node(null, left.weight + right.weight);   //创建的新的二叉树没有data，只有权值
            parent.left = left;
            parent.right = right;
            nodes.remove(left);         //已经处理过的两个二叉树从ArrayList中移除
            nodes.remove(right);
            nodes.add(parent);          //将新的二叉树加入到ArrayList
        }
        return nodes.get(0);            //处理到最后只剩下一个节点，就是哈夫曼树的根节点
    }

    public static HashMap<Byte, String> getCodes(Node node) {
        if (node == null)
            return null;
        StringBuilder stringBuilder = new StringBuilder();
        getCodes(node.left, "0", stringBuilder);    //处理根节点的左子树
        getCodes(node.right, "1", stringBuilder);   //处理根节点的右子树
        return huffmanCodes;
    }

    /**
     * @Description 根据传入的节点，将路径输入至Map
     * @Param [node, code, stringBuilder]
     * @Return void
     * @Author zzq
     * @Date 2020/8/7 16:18
     */
    public static void getCodes(Node node, String code, StringBuilder stringBuilder) {  //node：传入节点  code：路径 左子节点1，右子节点0  stringBuilder：拼接路径
        StringBuilder path = new StringBuilder(stringBuilder);     //StringBuilder用于拼接路径
        path.append(code);      //将code加入到路径中
        if (node != null) {       //如果node==null不处理
            if (node.data == null) {  //节点是非叶子节点
                getCodes(node.left, "0", path);       //向左递归
                getCodes(node.right, "1", path);      //向右递归
            } else {      //如果是叶子节点
                huffmanCodes.put(node.data, String.valueOf(path));   //找到了某个叶子节点，加入到哈夫曼编码中
            }
        }
    }

    /**
     * @Description 根据传入的字节数组与哈夫曼编码表压缩，并返回压缩后的字节数组
     * @Param [bytes, huffmanCodes]
     * @Return byte[]
     * @Author zzq
     * @Date 2020/8/7 17:40
     */
    public static byte[] zip(byte[] bytes, HashMap<Byte, String> huffmanCodes) {
        int len;
        String substring;
        StringBuilder tempString = new StringBuilder();   //处理过后的字符串
        for (byte b : bytes)
            tempString.append(huffmanCodes.get(b));   //遍历bytes数组，与huffmanCodes匹配得到哈夫曼编码，拼入temp
        len = (tempString.length() + 7) / 8;      //压缩后数组的长度
        byte[] huffmanCodeBytes = new byte[len];
        for (int i = 0, index = 0; i < tempString.length(); i += 8, index++) {  //每8位对应一个byte
            substring = i + 8 > tempString.length() ? tempString.substring(i) : tempString.substring(i, i + 8); //如果不够8位，取剩下所有；如果够8位，直接取8位
            huffmanCodeBytes[index] = (byte) Integer.parseInt(substring, 2);  //将substring后的8位按二进制转换为字节
        }
        return huffmanCodeBytes;
    }
}
