
public class GoldenGateBridge 
{
//	Ahmed Mian
//	Code-Foo 6 Application
	
//	Rebuilding the Golden Gate Bridge from Legos
	
//	1)	I first consider the dimensions of the standard lego brick. The length of a standard brick is approximately 31.8 mm,
//		a width of 15.8 mm, and a height of 9.6 mm. There are several other bricks with different dimensions, but for this project 
//		I will use the standard, four knob brick.
	
//	2)	The horizontal tolerance of this standard lego brick is 0.1 mm. In order to factor this into the calculations, I will say the effective length of a
//		standard brick is 31.9 mm.
	
//	3)	Calculate the volume of a standard lego brick, and convert it to meters in order to make comparisons to the Golden Gate Bridge easier.
//		The calculated volume of the is  4.823x10-6 m3/brick. This will be the fundamental unit from which I determine the number of bricks needed to build each 
//		area of the bridge. 
	
//	4)	The total length of the bridge, including approaches from abutment to abutment is 2,737 m. The width of the bridge is 27 m. This width accounts for both
//		the width of the roadway and the width of the sidewalk. The clearance of the bridge above mean high water is 67 m, and there are 152 m from the road to the
//		maximum height of the bridge (calculated in point 6). The total height from water to the top of the bridge is 227 m. Therefore, 227 m – (67 m + 152 m) = 8 m
//		of road. The volume of the road is calculated to be 2,737 m x 27 m x 8 m = 591,192 m3.
	
//	5)	By dividing the volume of the road by the volume of a lego brick, we find the number of bricks needed to form the roadway to be 122,577,648,767 bricks.
//		However, when examining the bridge it appears not all of this volume is solid; a lot of it is empty space. We will guess that roughly have of this space is
//		empty space, so to get a more accurate number, we will divide our number of bricks by 2. This leaves us with 61,288,824,384 bricks. NOTE: all brick decimals
//		will be rounded up to the next whole number, as we cannot build with a portion of a brick.
	
//	6)	Next, we look examine the two main towers. The height of a tower above water is 227 m. The dimensions of each leg is 10 m x 16 m. Each tower consists of two
//		legs and four beams which connect the legs together. With this information, we can determine that the volume of each leg which is 36,320 m3. By observing the
//		bridge, we can see that each beam has a length roughly equivalent to the width of the road. The width of the road is 19 m, so we will say that each beam has a
//		length of 19 m. Each beam has a width of 16m, because they are as wide as the longer dimension of a leg. Height of each beam will be the most inaccurate
//		measurement, as there is no known dimension to compare it to. By examining the towers, we can see that roughly 2/3 of the tower is above the roadway. By this
//		estimation, there are approximately 152 m of tower above the road, and 76 m of tower below the road. By eyeballing the size of the tower above the road, we can
//		see that each beam has a height equivalent to approximately 1/12 the height of a tower. With this in mind, we can take 1/12 of 152 m to arrive at a height of
//		12.67 m for each beam. Now, we can calculate the total volume of the four beams to be 4 x 12.67 m x 19 m x 16 m = 15,406.72 m2. The combined volume
//		of both legs (72,640 m3) added to the combined volume of the four beams (15,406.72 m2) gives us a total volume of 88,046.72 m2. Multiply this by 2 because we
//		have two towers, and we have 176,093.44 m2. This translates to 36,511,183,911 lego bricks. 
	
//	7)	Additionally, we must consider the narrower beams underneath the road. Because these beams are significantly narrower than the beams above the road, it 
//		is difficult to guess their dimensions. In order to make a rough guess, we will consider the total volume of each tower below the road, and attempt to subtract
//		the volume of empty space from our result. We will use the width of the bridge (27 m), the length of the leg (16 m), and the height of the tower from
//		the water to the road (76 m). The resulting volume is 32,832 m3. The volume of each leg below the road can be calculated to be 76 m x 10 m x 16 m = 12,160 m3.
//		The volume of the two legs below the road subtracted from the total volume below the road is 8,512 m3. We still need to account for the volume of the beams and
//		the volume of the empty space before we can arrive at an estimation. Just from a cursory observation, we will guess that ¾ of the volume below the bridge (except 
//		for the already calculated volume of the legs) is empty space. ¾ of 8,512 m3 gives us a volume of 6,384 m3, meaning that the volume of the narrower beams is 
//		2,128 m3. We multiply this by 2 because there are two towers, and we arrive at 4,256 m3. This equates to 882,438,317 lego bricks. 
		
//	8)	Thus, the total number of lego bricks comprising the towers are 36,511,183,091 + 882,438,317 = 37,393,622,228.
	
//	9)	The  two main cables have to be accounted for as well. The length of a main cable is  2,332 m, and the diameter of a main cable is 0.92 m. The radius, then, is
//		0.46 m. We will use the V = pi r2h (volume of a cylinder) to calculate volume of these cables. The volume of a main cable is 1,549.44 m3.  There are two main 
//		cables, so the total volume of the main cables is 3,098.88 m3. To occupy this space, we would need 642,521,253 lego bricks.
	
//	10)	The bridge also has 250 pairs of vertical suspender ropes that are spaced 50 feet apart across both sides of the bridge. Considering the fact that the height 
//		of bridge from the road and above is 152 m, and that there are 125 ropes of varying length that essentially repeat four times, we can assume that the length of 
//		each pair decreases by an increment of 1.216 m from each tower. In the interest of time, however, I will refrain from calculating the height of each vertical 
//		suspender.
		
//	11)	Add up totals determined in previous steps. The road (61,288,824,384 bricks) + the towers(37,393,622,228 bricks) + the cables 
//	(642,521,253 bricks) = 99,324,967,865 lego bricks. Please note that this number does not include the number of bricks needed to recreate all of the vertical
//	suspenders, so this number is likely a low estimate that will increase by a few billion once the suspenders are factored in.
	
//	These are the websites I used to get the dimensions for the bridge and the lego brick:
//	http://goldengatebridge.org/research/factsGGBDesign.php#length
//	http://www.robertcailliau.eu/Lego/Dimensions/zMeasurements-en.xhtml


}
