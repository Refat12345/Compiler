package AST.on_long_press;

import AST.declarevar;
import AST.navigator.Navigator;

import java.util.ArrayList;
import java.util.List;

  public class OnLongPress {
List<declarevar> declarevarList;
Navigator navigator;

public OnLongPress()
{
    this.declarevarList=new ArrayList<>();
    this.navigator=new Navigator();
}

public void addChild1(Navigator navigator)
{
    this.navigator=navigator;
}

public void addChild2(declarevar declarevar)
{
    this.declarevarList.add(declarevar);
}

      @Override
      public String toString() {
         StringBuilder stringBuilder=new StringBuilder();
         stringBuilder.append("\n"+declarevarList.get(0));
          for (int i = 1; i <declarevarList.size() ; i++) {
              stringBuilder.append(""+declarevarList.get(i)+" ");
          }
          return "onLongPress: () {"+ stringBuilder.toString()+""+navigator +";}";
      }
  }
