package programmers.p_package;

public class ForkliftAndCrane {
    class Box{
        Box left;
        Box right;
        Box up;
        Box down;
        boolean isPeaked;
        boolean leftExist;
        boolean rightExist;
        boolean upExist;
        boolean downExist;
        void setPeaked(){
            this.isPeaked = true;

        }

        void setBlankSide(){
            this.isPeaked = true;
            left.setBlankSide();
            right.setBlankSide();;
            
        }
    }

    public int solution(String[] storage, String[] requests){
        int answer = 0;
        return answer;
    }

}
