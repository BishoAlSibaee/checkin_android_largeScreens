package com.syriasoft.projectscontrol;

public class ROOM {

    public int id ;
    public int RoomNumber ;
    public int Status ;
    public int hotel ;
    public int Building ;
    public int building_id ;
    public int Floor ;
    public int floor_id ;
    public String RoomType ;
    public int SuiteStatus ;
    public int SuiteNumber ;
    public int SuiteId ;
    public int ReservationNumber ;
    public int roomStatus ;
    public int ClientIn ;
    public String message ;
    public int selected ;
    public int loading ;
    public int Tablet ;
    public String dep ;
    public int Cleanup ;
    public int Laundry ;
    public int RoomService ;
    public String RoomServiceText ;
    public int Checkout ;
    public int Restaurant ;
    public int MiniBarCheck ;
    public int Facility ;
    public int SOS ;
    public int DND ;
    public int PowerSwitch ;
    public int DoorSensor ;
    public int MotionSensor ;
    public int Thermostat;
    public int ZBGateway ;
    public int online ;
    public int CurtainSwitch ;
    public int ServiceSwitch ;
    public int lock ;
    public int Switch1 ;
    public int Switch2 ;
    public int Switch3 ;
    public int Switch4 ;
    public int Switch5 ;
    public int Switch6 ;
    public int Switch7 ;
    public int Switch8 ;
    public String LockGateway ;
    public String LockName ;
    public int powerStatus ;
    public int curtainStatus ;
    public int doorStatus ;
    public int DoorWarning ;
    public int temp ;
    public int TempSetPoint ;
    public int SetPointInterval ;
    public int CheckInModeTime ;
    public int CheckOutModeTime ;
    public String WelcomeMessage ;
    public String Logo ;
    public String token ;

    public ROOM(int id, int roomNumber, int status, int hotel, int building, int building_id, int floor, int floor_id, String roomType, int suiteStatus, int suiteNumber, int suiteId, int reservationNumber, int roomStatus, int clientIn, String message, int selected, int loading, int tablet, String dep, int cleanup, int laundry, int roomService, String roomServiceText, int checkout, int restaurant, int miniBarCheck, int facility, int SOS, int DND, int powerSwitch, int doorSensor, int motionSensor, int thermostat, int ZBGateway, int online, int curtainSwitch, int serviceSwitch, int lock, int switch1, int switch2, int switch3, int switch4, int switch5, int switch6, int switch7, int switch8, String lockGateway, String lockName, int powerStatus, int curtainStatus, int doorStatus, int doorWarning, int temp, int tempSetPoint, int setPointInterval, int checkInModeTime, int checkOutModeTime, String welcomeMessage, String logo, String token) {
        this.id = id;
        RoomNumber = roomNumber;
        Status = status;
        this.hotel = hotel;
        Building = building;
        this.building_id = building_id;
        Floor = floor;
        this.floor_id = floor_id;
        RoomType = roomType;
        SuiteStatus = suiteStatus;
        SuiteNumber = suiteNumber;
        SuiteId = suiteId;
        ReservationNumber = reservationNumber;
        this.roomStatus = roomStatus;
        ClientIn = clientIn;
        this.message = message;
        this.selected = selected;
        this.loading = loading;
        Tablet = tablet;
        this.dep = dep;
        Cleanup = cleanup;
        Laundry = laundry;
        RoomService = roomService;
        RoomServiceText = roomServiceText;
        Checkout = checkout;
        Restaurant = restaurant;
        MiniBarCheck = miniBarCheck;
        Facility = facility;
        this.SOS = SOS;
        this.DND = DND;
        PowerSwitch = powerSwitch;
        DoorSensor = doorSensor;
        MotionSensor = motionSensor;
        Thermostat = thermostat;
        this.ZBGateway = ZBGateway;
        this.online = online;
        CurtainSwitch = curtainSwitch;
        ServiceSwitch = serviceSwitch;
        this.lock = lock;
        Switch1 = switch1;
        Switch2 = switch2;
        Switch3 = switch3;
        Switch4 = switch4;
        Switch5 = switch5;
        Switch6 = switch6;
        Switch7 = switch7;
        Switch8 = switch8;
        LockGateway = lockGateway;
        LockName = lockName;
        this.powerStatus = powerStatus;
        this.curtainStatus = curtainStatus;
        this.doorStatus = doorStatus;
        DoorWarning = doorWarning;
        this.temp = temp;
        TempSetPoint = tempSetPoint;
        SetPointInterval = setPointInterval;
        CheckInModeTime = checkInModeTime;
        CheckOutModeTime = checkOutModeTime;
        WelcomeMessage = welcomeMessage;
        Logo = logo;
        this.token = token;
    }
}
