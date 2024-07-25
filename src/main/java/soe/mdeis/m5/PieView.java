package soe.mdeis.m5;

public class PieView implements Observer {

   private final DataModel dataModel;

   public PieView(DataModel dataModel) {
      this.dataModel = dataModel;
   }

   @Override
   public void print() {
      System.out.println("🍕");
      System.out.printf(
            "a: %d, b: %d, c: %d%n", dataModel.getA(), dataModel.getB(), dataModel.getC());
   }

}
