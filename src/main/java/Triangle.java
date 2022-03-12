public class Triangle {
    //判断是何种三角形
    public String triangle(int a, int b, int c){
        int[] sides = {a, b, c};
        for(int i=0;i<sides.length;i++){
            for(int j=0;j<sides.length-1;j++){
                if(sides[j]>sides[j+1]){
                    int temp = sides[j];
                    sides[j] = sides[j+1];
                    sides[j+1] = temp;
                }
            }
        }
        if(sides[0]+sides[1]<=sides[2]){
            return "It is not a triangle.";
        }else{
            String result = "Triangle:";
            if(sides[0] == sides[1] && sides[1] == sides[2]){
                result += " equilateral";
            }else if(sides[0] == sides[1]){
                result += " isosceles";
            }else{
                result += " scalene";
            }
            if(Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)){
                result += " right-angle";
            }
            return result;
        }
    }
}
