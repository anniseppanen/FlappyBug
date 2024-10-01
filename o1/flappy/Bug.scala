package o1.flappy

import o1.*

class Bug(private var currentPos: Pos):
  
  val radius = BugRadius
  private var yVelocity = 0.0
  
  def pos = currentPos

  def flap(y: Double) =
    yVelocity = -y

  def fall() =
    if pos.y < 350 then yVelocity += 2
    move(yVelocity)
    
  private def move(y: Double) =
    currentPos = (currentPos.addY(y)).clampY(0, 350)
    
  def isInBounds =
    currentPos.y > 0 && currentPos.y < Ground

  override def toString = s"center at $pos, radius $radius"