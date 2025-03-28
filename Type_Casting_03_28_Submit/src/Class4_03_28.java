public class Class4_03_28 {
    public static void main(String[]args){
        
        double doubleValue = 2.71828;
        
        System.out.println("\n=== double 형변환 ===");
        System.out.println("1. double -> byte: " + (byte)doubleValue); // 큰단위에서 작은단위로 변환, 게다가 정수형이므로 정수형으로 변환 (-128 ~ 127) 1바이트
        System.out.println("2. double -> short: " + (short)doubleValue); // short도 작은단위로 변환, 이것도 정수형이므로 정수형으로 변환 (-32768 ~ 32767) 2바이트
        System.out.println("3. double -> int: " + (int)doubleValue); // 정수형으로 변환되는 int, 애초에 int는 정수형이었음 (약 20억 위로 밑으로) 4바이트
        System.out.println("4. double -> long: " + (long)doubleValue); // long은 정수형임 (20억이 훌쩍 넘어갈때) 8바이트
        System.out.println("5. double -> float: " + (float)doubleValue); // float는 실수형임 4바이트 유효숫자 6~7개? 정도
    }
    
}
