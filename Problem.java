/**
 * Problem.java <br>
 * CS 110 Sample Class <br>
 * Definition for a simple problem type such as 4+5
 */


public class Problem
{
  private int left;
  private int right;
  private char operator;

 //constructors
  /**null constructor generates a random problem<br>
   * preconditions  none<br>
   * postconditions a random 1 digit problem is generated*/
  public Problem() 
  { int op;
    int swap;
    
    left = (int) (Math.random() * 100);
    right = (int) (Math.random() * 100);
    op = (int) (Math.random() *4);
    switch (op)
    {
      case 0: operator = '+';
              break;
      case 1: operator = '-';
              break;
      case 2: operator = '/';
              break;
      case 3: operator ='*';
              break;
    }
    switch (operator)
    {
      case '-':
        if (left > right)
        { swap =left;
          left = right;
          right = swap;
        }
        break;
      case '/':
        while (left % right !=0)
        {
           left = (int) (Math.random() * 100);
        }
        break;
    }
  }
/**determines and returns correct answer to problem<br>
  * preconditions  none<br>
  * postconditions the problem remains unchanged<br> 
  * @return the correct answer to the problem is returned*/   
  public int correctAnswer ()
 
  { int correct=0;
    switch (operator)
    {
      case '+': correct = left + right; break;
      case '-': correct = left - right; break;
      case '*': correct = left * right; break;
      case '/': correct = left / right; break;
    }
    return correct;
  }
 /**displays the problem <br>
   * preconditions  none<br>
   * postconditions the problem is displayed on the screen*/ 
  public String displayProblem()
 {
    return (left + "  " + operator + "  " + right + " = ");
  }
  public char getOperator()
  {
    return operator;
  }
  
  public int getLeft()
  {
    return left;
  }
  
  public int getRight()
  {
    return right;
  }
  
  public void setLeft( int l)
  {
    left =l;
  }
  
  public void setRight(int r)
  {
    right = r;
  }
}