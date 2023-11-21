
package loginandsignup;


public class Loginandsignup {


    public static void main(String[] args) {
        
        Login LoginFrame = new Login(); // 'Login' 클래스의 인스턴스를 생성.
        LoginFrame.setVisible(true); // 사용자에게 보이도록.
        LoginFrame.pack(); // LoginFrame' 창의 크기를 내부 컴포넌트들의 추천 크기에 맞게 조절하는 역할.
        LoginFrame.setLocationRelativeTo(null); // LoginFrame' 창의 위치를 화면의 중앙에 배치하도록 설정하는 역할.
        
    }
    
}
