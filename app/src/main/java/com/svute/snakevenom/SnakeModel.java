package com.svute.snakevenom;

import android.media.Image;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SnakeModel implements Serializable {
    private String snakeName;
    private int snakeImage;
    private String snakeVenom;
    private String snakeFeture;
    private String snakeLive;

    public SnakeModel(String snakeName, int snakeImage, String snakeVenom, String snakeFeture, String snakeLive) {
        this.snakeName = snakeName;
        this.snakeImage = snakeImage;
        this.snakeVenom = snakeVenom;
        this.snakeFeture = snakeFeture;
        this.snakeLive = snakeLive;
    }

    public String getSnakeName() {
        return snakeName;
    }

    public void setSnakeName(String snakeName) {
        this.snakeName = snakeName;
    }

    public int getSnakeImage() {
        return snakeImage;
    }

    public void setSnakeImage(int snakeImage) {
        this.snakeImage = snakeImage;
    }

    public String getSnakeVenom() {
        return snakeVenom;
    }

    public void setSnakeVenom(String snakeVenom) {
        this.snakeVenom = snakeVenom;
    }

    public String getSnakeFeture() {
        return snakeFeture;
    }

    public void setSnakeFeture(String snakeFeture) {
        this.snakeFeture = snakeFeture;
    }

    public String getSnakeLive() {
        return snakeLive;
    }

    public void setSnakeLive(String snakeLive) {
        this.snakeLive = snakeLive;
    }

    public static List<SnakeModel>getMock(){
        return new ArrayList<>(Arrays.asList(
            new SnakeModel("Rắn Hổ Mang chúa"
                    ,R.drawable.img_ho_mang,"Độc"
                    ,"Rắn trưởng thành có chiều dài trung bình từ 3,7m – 4m, nặng khoảng 6,8kg. Rắn có vạch chữ V ngược ở phía sau cổ, thân có màu xanh ô liu hoặc màu đen có các dải màng nhạt vằn ngang khắp cơ thể. Ở dưới bụng rắn có màu vàng nhạt hoặc màu kem."
                    ,"Các quốc gia Ấn Độ, Nepal, Bhutan, Bangladesh, Trung Quốc, Myanmar, Thái Lan, Lào, Campuchia, Việt Nam, Malaysia, Indonesia, Philippines, Singapore"),
            new SnakeModel("Rắn cạp nia"
                    ,R.drawable.img_cap_nia
                    ,"Độc"
                    ,"Đặc trưng với các khoang đen trắng xen kẽ, kéo dài khắp cơ thể. Rắn trưởng thành có chiều dài trung bình hơn 1m có con dài tới 2,5m, có tiết diện ngang hình tam giác, từ đoạn hông đến đuôi khá phẳng và hẹp dần thành điểm nhọn ở đuôi."
                    ,"Chủ yếu tại tiểu lục địa Ấn Độ (bao gồm cả Sri Lanka và miền đông Pakistan) và Đông Nam Á ")

        ));
    }

}
