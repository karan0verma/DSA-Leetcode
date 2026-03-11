class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int[] ansA1=new int[n];
        int[] ansA2=new int[n];
        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            {
                ansA1[i]=-1;
            }
            else if(!stack.isEmpty() && heights[stack.peek()]<heights[i])
            {
                ansA1[i]=stack.peek();
            }
            else if(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            {
                while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    ansA1[i]=-1;
                }
                else{
                    ansA1[i]=stack.peek();
                }
            }
            stack.push(i);
        }
        stack.clear(); 
       for(int j=n-1;j>=0;j--)
      {
          if(stack.isEmpty())
          {
              ansA2[j]=n;
          }
          else if(!stack.isEmpty() && heights[stack.peek()]<heights[j])
          {
              ansA2[j]=stack.peek();
          }
          else if(!stack.isEmpty() && heights[stack.peek()]>=heights[j])
          {
              while(!stack.isEmpty() && heights[stack.peek()]>=heights[j])
              {
                  stack.pop();
              }
              if(stack.isEmpty())
              {
                  ansA2[j]=n;
              }
              else
              {
                  ansA2[j]=stack.peek();
              }
          }
          stack.push(j);
      }
     int area=0;
     for(int i=0;i<n;i++){
        int width =ansA2[i]-ansA1[i]-1;
        int currarea= heights[i]*width;
        area=Math.max(area,currarea);
     }
        return area;
    }
}
