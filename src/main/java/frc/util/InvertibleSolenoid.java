package frc.util;

import edu.wpi.first.wpilibj.Solenoid;

public class InvertibleSolenoid extends Solenoid implements ISolenoid {

  private final boolean isInverted;
//  Default Solenoid, not inverted
  public InvertibleSolenoid(int module, int channel) {
    this(module, channel, false);
  }
//Makes Solenoid Object
  public InvertibleSolenoid(int module, int channel, boolean isInverted) {
	super(module, channel);
    this.isInverted = isInverted;
  }
//This activates the Solenoid
  @Override
  public void set(boolean state) {
	if (isInverted) {
		super.set(!state);
	} else {
		super.set(state);
	}
  }

  public boolean get(){
    return (isInverted ? !super.get() : super.get());
  }

}
