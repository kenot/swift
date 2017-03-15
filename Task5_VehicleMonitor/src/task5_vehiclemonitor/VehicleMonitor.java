/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5_vehiclemonitor;

import java.util.Scanner;
public class VehicleMonitor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double fuelPrice = sc.nextDouble();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] split = line.split(",");

            String type = split[0].trim();
            String model = split[1].trim();
            short power = Short.parseShort(split[2].trim());
            float fuelConsumption = Float.parseFloat(split[3].trim());
            short year = Short.parseShort(split[4].trim());
            short distance = Short.parseShort(split[5].trim());

            Vehicle vehicle;
            String licenseNo = String.format("%04d", i);

            if (split.length == 8) {
                float weight = Float.parseFloat(split[6].trim());
                String color = split[7].trim();
                vehicle = new Vehicle(licenseNo, type, model, power, fuelConsumption, year, weight, color);
            } else {
                vehicle = new Vehicle(licenseNo, type, model, power, fuelConsumption, year);
            }

            System.out.println(vehicle);
            System.out.printf("Insurance cost: %.2f - Travel cost: %.2f%n", 
                    vehicle.getInsurancePrice(), vehicle.calculateTripPrice(fuelPrice, distance));
        }
    }
    
}
