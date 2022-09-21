package pojo;

public class Message {

    private int mid;            //内容id
    private String m_text;      //聊天内容
    private int send_id;        //发送者id
    private int received_id;    //接收者id

    public Message() {
    }

    public Message(int mid, String m_text, int send_id, int received_id) {
        this.mid = mid;
        this.m_text = m_text;
        this.send_id = send_id;
        this.received_id = received_id;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getM_text() {
        return m_text;
    }

    public void setM_text(String m_text) {
        this.m_text = m_text;
    }

    public int getSend_id() {
        return send_id;
    }

    public void setSend_id(int send_id) {
        this.send_id = send_id;
    }

    public int getReceived_id() {
        return received_id;
    }

    public void setReceived_id(int received_id) {
        this.received_id = received_id;
    }
}
