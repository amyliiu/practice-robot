// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class MotorController extends SubsystemBase {
  private static final int kMotorPort = 0;
  private static final int kJoystickPort = 0; 

  private MotorController m_motor;
  private Joystick m_joystick;

  
  /** Creates a new MotorController. */
  public MotorController() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    m_motor = new PWMSparkMax(kMotorPort);
    m_joystick = new Joystick(kJoystickPort);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
