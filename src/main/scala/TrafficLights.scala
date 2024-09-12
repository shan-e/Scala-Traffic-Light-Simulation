object TrafficLights {
  private val greenLightTiming = 10
  private val yellowLightTiming = 3
  private val redLightTiming = 3
  private val pedestrianLightTiming = 5
  private val rightTurningTiming = 5

  def main(args: Array[String]): Unit = {
     printRoadLayout()

    val reset = "\u001B[0m"
    val red = "\u001B[31m"
    val yellow = "\u001B[33m"
    val green = "\u001B[32m"

    
    val redLight = red + "STOP" + reset
    val flashingYellow = yellow + "SLOW" + reset
    val yellowLight = yellow + "SLOW" + reset
    val greenLight = green + "GO" + reset

    var northAndSouthTrafficLightStatus = greenLight
    var westAndEastTrafficLightStatus = redLight
    var northAndSouthRightTrafficLightStatus = flashingYellow
    var westAndEastRightTrafficLightStatus = redLight
    var pedestrianTrafficLightStatus = redLight


    for (_ <- 0 to 1) {
      northAndSouthTrafficLightStatus = greenLight
      westAndEastTrafficLightStatus = redLight
      northAndSouthRightTrafficLightStatus = flashingYellow
      westAndEastRightTrafficLightStatus = redLight
      pedestrianTrafficLightStatus = redLight

      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, greenLightTiming)
      sleep(greenLightTiming)

      northAndSouthRightTrafficLightStatus = greenLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, rightTurningTiming)
      sleep(rightTurningTiming)

      northAndSouthTrafficLightStatus = yellowLight
      northAndSouthRightTrafficLightStatus = yellowLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, yellowLightTiming)
      sleep(yellowLightTiming)

      northAndSouthTrafficLightStatus = redLight
      northAndSouthRightTrafficLightStatus = redLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, redLightTiming)
      sleep(redLightTiming)

      westAndEastTrafficLightStatus = greenLight
      westAndEastRightTrafficLightStatus = flashingYellow
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, greenLightTiming)
      sleep(greenLightTiming)

      westAndEastRightTrafficLightStatus = greenLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, rightTurningTiming)
      sleep(rightTurningTiming)

      westAndEastTrafficLightStatus = yellowLight
      westAndEastRightTrafficLightStatus = yellowLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, yellowLightTiming)
      sleep(yellowLightTiming)

      westAndEastTrafficLightStatus = redLight
      westAndEastRightTrafficLightStatus = redLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, rightTurningTiming)
      sleep(redLightTiming)

      pedestrianTrafficLightStatus = greenLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, pedestrianLightTiming)
      sleep(pedestrianLightTiming)

      pedestrianTrafficLightStatus = yellowLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, yellowLightTiming)
      sleep(yellowLightTiming)

      pedestrianTrafficLightStatus = redLight
      printTrafficStatuses(northAndSouthTrafficLightStatus, westAndEastTrafficLightStatus, northAndSouthRightTrafficLightStatus, westAndEastRightTrafficLightStatus, pedestrianTrafficLightStatus, redLightTiming)
      sleep(redLightTiming)

    }
  }

  private def printTrafficStatuses(northAndSouthTrafficLightStatus: String, westAndEastTrafficLightStatus: String, northAndSouthRightTrafficLightStatus: String, westAndEastRightTrafficLightStatus: String, pedestrianTrafficLightStatus: String, timer: Int): Unit = {
    println("Timer: " + timer + " seconds")
    println(f"North and South Traffic Light:$northAndSouthTrafficLightStatus%30s")
    println(f"North and South Right Turning Traffic Light:$northAndSouthRightTrafficLightStatus%16s")
    println(f"West and East Traffic Light:$westAndEastTrafficLightStatus%32s")
    println(f"West and East Right Turning Traffic Light:$westAndEastRightTrafficLightStatus%18s")
    println(f"Pedestrian Traffic Light:$pedestrianTrafficLightStatus%35s\n")
  }

  private def printRoadLayout(): Unit = {
    val spaceChar = " "
    val vLaneWidth = "          "
    val dividingLine = "|"
    val hLaneWidth = "----------"

    val reset = "\u001B[0m"
    val red = "\u001B[31m"
    val yellow = "\u001B[33m"
    val green = "\u001B[32m"

    val greenLightANSII = green + "GO" + reset
    val yellowLightANSII = yellow + "SLOW" + reset
    val redLightANSII = red + "STOP" + reset

    println("\n\n\nPoint of View of secondary road intersecting a dual carriageway\n")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$dividingLine$reset$vLaneWidth$dividingLine$vLaneWidth$red$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$dividingLine$reset$vLaneWidth$dividingLine$vLaneWidth$red$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$dividingLine$reset$vLaneWidth$dividingLine$vLaneWidth$red$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$dividingLine$reset$vLaneWidth$dividingLine$vLaneWidth$red$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$dividingLine$reset$vLaneWidth$dividingLine$vLaneWidth$red$dividingLine$spaceChar%10s$reset")
    println(f"$red$hLaneWidth%10s$spaceChar%34s$hLaneWidth%10s$reset")
    println()
    println(f"$hLaneWidth%10s$spaceChar%34s")
    println()
    println(f"$red$hLaneWidth%10s$spaceChar%34s$hLaneWidth%10s$reset")
    println()
    println(f"$spaceChar%10s$spaceChar%34s$hLaneWidth%10s")
    println()
    println(f"$red$hLaneWidth%10s$spaceChar%34s$hLaneWidth%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$reset$dividingLine$red$vLaneWidth$dividingLine$vLaneWidth$dividingLine$spaceChar%7s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$reset$dividingLine$red$vLaneWidth$dividingLine$vLaneWidth$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$reset$dividingLine$red$vLaneWidth$dividingLine$vLaneWidth$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$reset$dividingLine$red$vLaneWidth$dividingLine$vLaneWidth$dividingLine$spaceChar%10s$reset")
    println(f"$red$spaceChar%10s$dividingLine$vLaneWidth$reset$dividingLine$red$vLaneWidth$dividingLine$vLaneWidth$dividingLine$spaceChar%10s$reset")
  }

  private def sleep(timeInSeconds: Int): Unit = {
    val timeInMilliseconds = timeInSeconds * 1000
    Thread.sleep(timeInMilliseconds)
  }
}