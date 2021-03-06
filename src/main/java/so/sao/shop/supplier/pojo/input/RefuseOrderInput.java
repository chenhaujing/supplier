package so.sao.shop.supplier.pojo.input;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by acer on 2017/8/17.
 */
public class RefuseOrderInput {
    /**
     * 订单编号
     */
    @NotEmpty(message = "订单编号不能为空")
    private String orderId;
    /**
     * 拒收理由
     */
    @NotEmpty(message = "拒收理由不能为空")
    private String refuseReason;
    /**
     * 拒收图片1
     */
    private String refuseImgUrlA;
    /**
     * 拒收图片2
     */
    private String refuseImgUrlB;
    /**
     * 拒收图片3
     */
    private String refuseImgUrlC;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    public String getRefuseImgUrlA() {
        return refuseImgUrlA;
    }

    public void setRefuseImgUrlA(String refuseImgUrlA) {
        this.refuseImgUrlA = refuseImgUrlA;
    }

    public String getRefuseImgUrlB() {
        return refuseImgUrlB;
    }

    public void setRefuseImgUrlB(String refuseImgUrlB) {
        this.refuseImgUrlB = refuseImgUrlB;
    }

    public String getRefuseImgUrlC() {
        return refuseImgUrlC;
    }

    public void setRefuseImgUrlC(String refuseImgUrlC) {
        this.refuseImgUrlC = refuseImgUrlC;
    }
}
