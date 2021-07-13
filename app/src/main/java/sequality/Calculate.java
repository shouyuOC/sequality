package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y){
    int sumXY=sum(x, y);
    return (double)sumXY / 2;
  }

  public int SumRange(int x, int y){
    int sumXY=0;

    for(int i=x;i<=y;i++){
      sumXY+=i;
    }

    return sumXY;
  }

  public double AveRange(int x, int y){
    int sumXY=SumRange(x, y);
    return (double)sumXY / (y - x + 1);
  }

  public int SumOdd(int x, int y){
    int sum=0;

    for(int i=x;i<=y;i++){
      if(i%2 == 1){
        sum = sum + i;
      }
    }

    return sum;
  }

  public int SumEven(int x, int y){
    int sum=0;

    for(int i=x;i<=y;i++){
      if(i%2 == 0){
        sum+=i;
      }
    }

    return sum;
  }
}
