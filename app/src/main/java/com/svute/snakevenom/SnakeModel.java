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
                new SnakeModel("Milk Snake"
                        ,R.drawable.img_milk
                        ,"Không độc"
                        ,"Đầu và lưng có màu xanh cỏ, vảy môi trên có màu hơi nhạt, bộ phận rãnh vảy có màu đen; mặt bụng phần đầu có màu trắng đục. Mình và mặt lưng đuôi có màu xanh cỏ, vùng cổ và da thịt giữa các mảng vảy của đoạn thân trước có màu đỏ; mình và mặt bụng đuôi có màu trắng vàng."
                        ,"Vì đây là loài thú cảnh nên được nhân giống và phổ biến trên toàn thế giới"),
                new SnakeModel("Rắn cạp nia"
                        ,R.drawable.img_cap_nia
                        ,"Độc"
                        ,"Đặc trưng với các khoang đen trắng xen kẽ, kéo dài khắp cơ thể. Rắn trưởng thành có chiều dài trung bình hơn 1m có con dài tới 2,5m, có tiết diện ngang hình tam giác, từ đoạn hông đến đuôi khá phẳng và hẹp dần thành điểm nhọn ở đuôi."
                        ,"Chủ yếu tại tiểu lục địa Ấn Độ (bao gồm cả Sri Lanka và miền đông Pakistan) và Đông Nam Á "),
                new SnakeModel("Rắn Hổ Mang chúa"
                        ,R.drawable.img_ho_mang,"Độc"
                        ,"Rắn trưởng thành có chiều dài trung bình từ 3,7m – 4m, nặng khoảng 6,8kg. Rắn có vạch chữ V ngược ở phía sau cổ, thân có màu xanh ô liu hoặc màu đen có các dải màng nhạt vằn ngang khắp cơ thể. Ở dưới bụng rắn có màu vàng nhạt hoặc màu kem."
                        ,"Các quốc gia Ấn Độ, Nepal, Bhutan, Bangladesh, Trung Quốc, Myanmar, Thái Lan, Lào, Campuchia, Việt Nam, Malaysia, Indonesia, Philippines, Singapore"),
                new SnakeModel("Rắn cỏ cổ đỏ"
                        ,R.drawable.img_co_do
                        ,"Độc"
                        ,"Đặc trưng với các khoang đen trắng xen kẽ, kéo dài khắp cơ thể. Rắn trưởng thành có chiều dài trung bình hơn 1m có con dài tới 2,5m, có tiết diện ngang hình tam giác, từ đoạn hông đến đuôi khá phẳng và hẹp dần thành điểm nhọn ở đuôi."
                        ,"Phân bố ở các nước như bán đảo Đông Dương, Trung Quốc, Indonesia, Nepal, v.v."),
                new SnakeModel("Rắn lục cườm"
                        ,R.drawable.img_luc_cuom
                        ,"Không độc"
                        ,"Rắn Lục cườm hay rắn Cườm là một loài rắn nước có kích thước nhỏ. Ở phần đầu của chúng có những vệt màu đen, cằm và phía trên mép miệng có màu ngà voi. "
                        ,"Ở trên thế giới loài rắn này được tìm thấy phổ biến ở các nước như Thái Lan, Mã Lai, Ấn Độ, Myanmar hay Trung Quốc."),
                new SnakeModel("Rắn lục đuôi đỏ"
                        ,R.drawable.img_duoi_do
                        ,"Độc"
                        ,"Theo đúng mô tả, rắn lục đuôi đỏ có phần đuôi đỏ ửng - rất dễ nhận biết."
                        ,"Sống chủ yếu tại khu vực Đông Nam Á, trong đó có Việt Nam."),
                new SnakeModel("Rắn nước (dendrelaphis)"
                        ,R.drawable.img_nc_de
                        ,"Không độc"
                        ,"Đặc điểm chính của loài này là lưng và đầu có màu giống như đồng, trên mặt có các dải màu đen chạy xuống cổ. Trên hai hàng vảy thân có sọc màu vàng hoặc màu kem được viền phía trên và dưới bởi một đường kẻ đen. Bên hông đầu và cằm màu trắng. Những đốm màu xanh dương phân bố khi thân vươn dài để hít thở vào và để dọa nạt."
                        ,"Phân bố ở việt nam Trung Quốc, Thái Lan, Mianma, Malayxia, Philippin…"),
                new SnakeModel("Rắn nước (Xenochrophis) "
                        ,R.drawable.img_ran_nv
                        ,"Không độc"
                        ,"Thân màu nâu xám, có các vân đen ngang ở trên và bên lưng, đôi khi xen kẽ các vệt nâu đỏ nhạt. mặt trên đầu sẫm hơn, có hai vệt đen từ mắt tới các tấm mép trên thứ 6 và thứ 8, một vệt đen khác từ sau góc hàm đến gáy. Bụng màu trắng đục, mép trước của tấm bụng thường có viền đen."
                        ,"Loài này phân bố rất rộng chúng hầu như có từ Bắc đến Nam và có rất nhiều ở đồng bằng sông Cửu Long")
        ));
    }

}
