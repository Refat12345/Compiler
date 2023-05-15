package AST.Class;

import AST.List.List;
import AST.declarevar;
import AST.function.function;




public class class4 {
 declarevar declarevar;
 AST.function.function function;
 List list;

 public void setDeclarevar(AST.declarevar declarevar) {
  this.declarevar = declarevar;
 }

 public void setFunction(function function) {
  this.function = function;
 }

 public void setList(List list) {
  this.list = list;
 }

 @Override
 public String toString() {
  if (declarevar!=null)
   return declarevar+"";
  if (function!=null)
   return function+"";
  return list+"";
 }
}
