//https://leetcode.com/problems/pascals-triangle/description/

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> rowList = new ArrayList<Integer>();
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    rowList.add(1);
                }else{
                    rowList.add(triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j));
                }
            }
            triangle.add(rowList);
        }
        return triangle;
    }
}
