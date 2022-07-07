
class Cuboid
{
    var length=0.0;
    var breadth=0.0;
    var height=0.0;
    init(length:Double,breadth:Double,height:Double)
    {
        self.length=length;
        self.breadth=breadth;
        self.height=height;
    }
}
class Prism
{
   var sides=0.0;
   var height=0.0;
   init(sides:Double,height:Double)
   {
       self.sides=sides;
       self.height=height;
   }
}

class Application
{

    func getVolume1(cuboidVolume:Cuboid)->Double
     {
         return cuboidVolume.length*cuboidVolume.breadth*cuboidVolume.height;
     }
     func getTotalVolume1(cuboidObj :[Cuboid])->Double
     {
         var volume=0.0;
         for value in cuboidObj[0...cuboidObj.count-1]
         {
             volume+=getVolume1(cuboidVolume:value)
         }
         return volume;
     }
     
     func getVolume2(prismVolume:Prism)->Double
     {
         return prismVolume.sides*prismVolume.sides*prismVolume.height;
     }
     func getTotalVolume2(prismObj :[Prism])->Double
     {
         var volume=0.0;
         for value in prismObj[0...prismObj.count-1]
         {
             volume+=getVolume2(prismVolume:value)
         }
         return volume;
     }
}
let cuboid1=Cuboid(length:4,breadth:4,height:4)
let cuboid2=Cuboid(length:5,breadth:5,height:5)
let prism1=Prism(sides:3,height:3)
let prism2=Prism(sides:2,height:2)
let volume=Application()
print("Volume of cuboid1-\(volume.getVolume1(cuboidVolume:cuboid1))")
print("Volume of cuboid2-\(volume.getVolume1(cuboidVolume:cuboid2))")
print("Volume of Prism1-\(volume.getVolume2(prismVolume:prism1))")
print("Volume of Prism2-\(volume.getVolume2(prismVolume:prism2))")
let cuboidArray=[cuboid1,cuboid2]
let prismArray=[prism1,prism2]
print("Total volume-\(volume.getTotalVolume1(cuboidObj:cuboidArray))")
print("Total volume-\(volume.getTotalVolume2(prismObj:prismArray))")
