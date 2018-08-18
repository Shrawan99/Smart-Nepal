package com.example.nasa.smart_nepal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Database_Telephone {

    public static HashMap<String, List<String>> getInfo()
    {
        HashMap<String, List<String>> TelephoneDetails = new HashMap<String, List<String>>();

        List<String> Hospitals = new ArrayList<String>();
        Hospitals.add("Ayurved Hospital, Tundikhel    \n 01-4221119 ");
        Hospitals.add("Bhaktapur Hospital, Doodh Pati    \n 01-6610676");
        Hospitals.add("B&B Hospital, Gwarko    \n 01-5533206");
        Hospitals.add("Bir Hospital, Tundikhel    \n 01-4221119, 4223807");
        Hospitals.add("Bir Hospital Emergency, Tundikhel    \n 01-4221988, 4223807 ");
        Hospitals.add("Birendra Police Hospital, Maharajgunj    \n 01-4412530, 4412430 ");
        Hospitals.add("Birendra Army Hospital, Chhauni    \n 01-4271940, 4271965 ");
        Hospitals.add("Blood Bank, Bhrikuti Mandap    \n 01-4225344");
        Hospitals.add("Central Jail Hospital, Nakkhu    \n 01-4212443, 4215466");
        Hospitals.add("Community Hospital, Jorpati  \n 01-4470874");
        Hospitals.add("Capital Hospital    \n 01-424402");
        Hospitals.add("Civil Service Hospital,New Baneshwor    \n 01-4107000, 4107002 ");
        Hospitals.add("Eye Hospital, Tripureswor    \n 01-4250691");
        Hospitals.add("Homeopathic Hospital, Harihar Bhawan    \n 01-5522092 ");
        Hospitals.add("Infection Disease Hospital, Teku     \n 01-4211112, 4211334");
        Hospitals.add("Hospital and Research Centre     \n 01-4476225");
        Hospitals.add("Kanti Children Hospital, Maharanjgunj     \n 01-4411134, 4411140, 44111150");
        Hospitals.add("Kantipur Dental Hospital, Bansbari    \n 01-4371603, 4372976 ");
        Hospitals.add("Kantipur Hospital, New Baneshwor    \n 01-4498757");
        Hospitals.add("Kathmandu Model Hospital    \n 01-4240805");
        Hospitals.add("Life Care Hospital     \n 01-4227735");
        Hospitals.add("Martyr Gangalal National Heart Centre    \n 01-4493684");
        Hospitals.add("Miteri Hospital     \n 01-4280555, 4222305");
        Hospitals.add("Maternity Hospital, Thapathali    \n 01-4253276, 4253277");
        Hospitals.add("Mental Hospital, Lagankhel     \n 01-5521612, 5521333");
        Hospitals.add("Medicare National Hospital     \n 01-4467067");
        Hospitals.add("Nepal Eye Bank     \n 01-4493684 ");
        Hospitals.add("Nepal Police Hospital    \n 01-4412430, 44122530");
        Hospitals.add("Norvic Hospital     \n 01-4258554");
        Hospitals.add("National Kidney Centre     \n 01-4429866, 4426016 ");
        Hospitals.add("Patan Hospital, Lagankhel    \n 01-5522566, 5521048, 5522266");
        Hospitals.add("Shree Satya Sai Centre     \n 01-4498035 ");
        Hospitals.add("Til Ganga Eye Hospital, Til Ganga     \n 01-4476575, 4474937 ");
        Hospitals.add("TU Teaching Hospital, Maharanjgunj    \n 01-4412707, 4412808, 4412505");
        Hospitals.add("Teku Hospital    \n 01-4253396");
        Hospitals.add("Vayodha Hospital ,Balkhu     \n 01-4281666,2111333");




        List<String> PoliceDepartment = new ArrayList<String>();
        PoliceDepartment.add("Police Control \n 100");
        PoliceDepartment.add("Police Emergency Number \n 01-4228435, 4226853");
        PoliceDepartment.add("Central Jail Guard, Tripureshwor\n 01-4253398, 4253308");
        PoliceDepartment.add("Dilli Bazar Khar Guard, Charkhal \n 01-4414335");
        PoliceDepartment.add("District Police Office, Kathmandu \n 01-4261790, 4261945");
        PoliceDepartment.add("District Police Office, Lalitpur \n 01-5521350, 5521207");
        PoliceDepartment.add("District Police Office, Bhaktapur\n 01-6614821, 6614708");
        PoliceDepartment.add("Interpol Section, Naxal \n 01-4411210, 4412602");
        PoliceDepartment.add("Nakhu Jail Guard, Lalitpur \n 01-5535381, 5521112");
        PoliceDepartment.add("Police Headquarter Exchange, Naxal \n 01-4411210, 4410088");
        PoliceDepartment.add("Police Traffic Office, Tourist Police, Bhrikuti Mandap\n 01-4247041");
        PoliceDepartment.add("Regional Police Unit Office, Hanumandhoka\n 01-4262945, 4261360, 4223011");


        List<String> Ambulance= new ArrayList<String>();
        Ambulance.add("Ambulance Bishal Bazar, New Road\n 01-4244121");
        Ambulance.add("Ambulance Kathmandu Model Hospital, Bagbzar\n 01-4240805,4240806");
        Ambulance.add("Ambulance Lalitpur Municipality, Pulchowk\n 01-5527003");
        Ambulance.add("Ambulance Nepal Chamber of Commerce\n 01-4230213");
        Ambulance.add("Ambulance Nepal Red Cross Society \n 01-4228094");
        Ambulance.add("Ambulance Paropakar \n 01-4251614, 4211959");
        Ambulance.add("Ambulance Shiva Sakti Yuba Sewa, Kathmandu \n 01-4478111");
        Ambulance.add("Lions Club of Kathmandu Central, Kathmandu \n 01-4472211");
        Ambulance.add("Strongtsen Bhrikuti Samajik Tatha Sanskritik Uthan Sangh, Boudha \n 01-4473166");
        Ambulance.add("Agrawal Sewa Centre\n 01-4424875");
        Ambulance.add("Aasara Drug Rehabilitation Center \n 01-4384881");


        List<String> Blood_Trans = new ArrayList<String>();
        Blood_Trans.add("Blood Transmission Service, Kathmandu \n 01-4229344, 4225344");


        List<String> Night_taxi = new ArrayList<String>();
        Night_taxi.add("Night Taxi Service, Dharmapath \n 01-4244485, 4224375");


        List<String> Funeral_vechicle= new ArrayList<String>();
        Funeral_vechicle.add("Bir Hospital, Tundikhel \n 01-4221119");
        Funeral_vechicle.add("Nepal Chamber of Commerce, Kantipath \n 01-4222890, 4230213");
        Funeral_vechicle.add("Marwadi Sewa Samati, Phasikeb \n 01-4255540,4255740");
        Funeral_vechicle.add("Strongtsen Bhrikuti Samajik Tatha Sanskritik Uthan Sangh, Boudha \n 01-4473166");


        List<String> Telecommunication = new ArrayList<String>();
        Telecommunication.add("Complaint for Maintenance\n 198");
        Telecommunication.add("Domestic Trunk, (Via Operator) \n 180");
        Telecommunication.add("International Trunk Booking (For India) \n 187");
        Telecommunication.add("Enquiry \n 197");
        Telecommunication.add("Overseas Trunk Booking, (Via Operator) \n 186");
        Telecommunication.add("STD & ISD Maintenance\n 182");



        List<String> International_flight = new ArrayList<String>();
        International_flight.add("International Flight Services,\n 01-4470311, 4472835");



        List<String>Rescues = new ArrayList<String>();
        Rescues.add("Himalayan Rescue Association, Kathmandu \n 01-4262746");
        Rescues.add("Himalayan Rescue Dog Squad, Pokhara \n 61-520374");

        List<String>Electricity_power = new ArrayList<String>();
        Electricity_power.add("KATHMANDU AREA");
        Electricity_power.add(" Balaju \n 01-4350896");
        Electricity_power.add(" Baneshwor\n 01-4474161, 4471201");
        Electricity_power.add(" Chabahil\n 01-4474164");
        Electricity_power.add(" Kirtipur \n 01-4330428");
        Electricity_power.add(" Kuleshwor\n 01-4272404, 4272402");
        Electricity_power.add(" Maharajgunj \n 01-4357219");
        Electricity_power.add(" Ratna Park \n 01-4227061, 4225584");
        Electricity_power.add("PATAN AREA");
        Electricity_power.add(" Lagankhel\n 01-5525618, 5521365");
        Electricity_power.add(" Pulchowk\n 01-5523061, 5522043");
        Electricity_power.add("BHAKTAPUR AREA");
        Electricity_power.add(" Bhaktapur\n 01-6610065");
        Electricity_power.add(" Thimi (Old)\n 01-6610126");
        Electricity_power.add(" Thimi (New)\n 01-6610065, 6610319");



        TelephoneDetails.put("Hospitals", Hospitals);
        TelephoneDetails.put("Police Department", PoliceDepartment);
        TelephoneDetails.put("Ambulance", Ambulance);
        TelephoneDetails.put("Blood Transmission Service", Blood_Trans);
        TelephoneDetails.put("Night Taxi", Night_taxi);
        TelephoneDetails.put("Telecommunication Service", Telecommunication);
        TelephoneDetails.put("International Flight Service", International_flight);
        TelephoneDetails.put("Rescue Service", Rescues);
        TelephoneDetails.put("Electricity-Power Failure", Electricity_power);
        TelephoneDetails.put("Funeral Vechicle", Funeral_vechicle);

        return TelephoneDetails;

    }

}
