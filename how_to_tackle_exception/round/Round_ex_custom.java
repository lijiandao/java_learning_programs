package round;


public class Round_ex_custom {
    private double radius;
    public class NegativeRadiusException extends Exception{
        public NegativeRadiusException(String message) {
            super(message);
        }
    }
    public double caculateArea(double Radius) throws NegativeRadiusException {  //这里就是可能抛出的异常的对象
        if(Radius<0)
        {
            NegativeRadiusException e = new NegativeRadiusException("来自于自定义错误类的报错：error! radius must be positive");
            // 这里创建了一个通常的使用的通用异常类，然后抛出了这个异常，这个异常将会被打印出来，以方便定位异常地点；
            throw e;
        }
        return Math.PI * Radius * Radius;
    }

    public Round_ex_custom(double Radius) {
        radius=Radius;
    }

    public double getArea() {
        try {
            return caculateArea(radius);
        } catch (NegativeRadiusException e) {
            e.printStackTrace();
            //  那么它会执行 e.printStackTrace(); 打印异常堆栈，
        }
        //catch仅仅是一个异常处理，如果出现异常就会继续执行catch以及之后的代码部分，不会停止程序运行
        return 0; // Add a default return value in case of exception
    }
}
