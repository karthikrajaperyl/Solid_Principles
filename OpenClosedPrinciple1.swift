class Geo_Object
{
func getVolume()->Double{
    return 0.0
}
}
class Cuboid :Geo_Object
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
     override func getVolume()->Double
     {
         return length*breadth*height;
     }
}
class Prism :Geo_Object
{
   var sides=0.0;
   var height=0.0;
   init(sides:Double,height:Double)
   {
       self.sides=sides;
       self.height=height;
   }
   override func getVolume()->Double
     {
         return sides*sides*height;
     }
}

var cuboid1=Cuboid(length:4,breadth:4,height:4)
var cuboid2=Cuboid(length:5,breadth:5,height:5)
var prism1=Prism(sides:3,height:3)
var prism2=Prism(sides:2,height:2)
var geoObject:Geo_Object=Cuboid(length:4,breadth:4,height:4)
print("Volume of cuboid1-\(geoObject.getVolume())")
geoObject=Cuboid(length:5,breadth:5,height:5)
print("Volume of cuboid2-\(geoObject.getVolume())")
geoObject=Prism(sides:3,height:3)
print("Volume of Prism1-\(geoObject.getVolume())")
geoObject=Prism(sides:2,height:2)
print("Volume of Prism2-\(geoObject.getVolume())")
//let cuboidArray=[cuboid1,cuboid2]
//let prismArray=[prism1,prism2]
//print("Total volume-\(volume.getTotalVolume1(cuboidObj:cuboidArray))")
//print("Total volume-\(volume.getTotalVolume2(prismObj:prismArray))")
