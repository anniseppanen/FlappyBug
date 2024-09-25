package o1.flappy

import o1.*
import scala.util.Random

// This class is introduced in Chapter 2.6.

class Obstacle(val radius: Int):
  
  private var currentPos = randomLaunchPosition()
  
  def pos = currentPos
  
  def isActive =
    currentPos.x+radius >= 0
    
  def approach() =
    if isActive then
      currentPos = currentPos.addX(-ObstacleSpeed)
    else 
      currentPos = randomLaunchPosition()
    
  def touches(bug: Bug) =
    currentPos.distance(bug.pos) < radius + bug.radius
    
  private def randomLaunchPosition() =
    val launchX = ViewWidth + radius + Random.nextInt(500)
    val launchY = Random.nextInt(ViewHeight)
    Pos(launchX, launchY)

  override def toString = "center at " + this.pos + ", radius " + this.radius

end Obstacle
