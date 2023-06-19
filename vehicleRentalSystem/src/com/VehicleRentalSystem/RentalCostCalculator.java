package com.VehicleRentalSystem;

import java.math.BigDecimal;

public interface RentalCostCalculator {
	BigDecimal calculateRentalCost(Rental rental);

}
