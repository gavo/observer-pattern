package soe.mdeis.m5;

public class DataCenterApp {

   public void execute() {
      var dataModel = new DataModel(50, 30, 20);

      dataModel.attach(new TableView(dataModel));
      dataModel.attach(new BarView(dataModel));
      dataModel.attach(new PieView(dataModel));

      dataModel.setB(100);
      dataModel.setC(58);
      dataModel.setA(-10);
   }
}
