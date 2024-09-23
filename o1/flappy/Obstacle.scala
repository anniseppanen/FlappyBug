package o1.flappy

import o1.*

// This class is introduced in Chapter 2.6.

class Obstacle(val radius: Int, private var currentPos: Pos):
  
  def pos = this.currentPos

  def approach() =
    this.currentPos = this.currentPos.addX(-ObstacleSpeed)
    
  def touches(bug: Bug) =
    pos.distance(bug.pos) < radius + bug.radius

  override def toString = "center at " + this.pos + ", radius " + this.radius

end Obstacle
