# Socket IO Appointments Client for Java

This is a simple skeleton of an appointments client, which acts on events received by socket IO in order to perform actions on data models.

## Installation
The `out/artifacts` folder of the repository contains a JAR file, that can be run, or imported into your project.

Alternatively, clone the repository onto your filesystem, and initialize a project using your IDE of preference. 

## Dependencies
The gradle build file is included for dependency management.
This project uses the following main dependencies:
- [Socket.IO-client Java](https://github.com/socketio/socket.io-client-java)
- [GSON](https://github.com/google/gson)

## Testing
A simple nodeJS test server is included in the `testserver` folder. 

To run the test server:
1. In the `testserver` folder, run `npm install`
2. Run `node app.js`
> **Note:**
> You will need to [install NodeJS](https://nodejs.org/en/download/) if you haven't already

Once you have the test server running, to run the Java client:
1. In the `out/artifacts/socket_io_appointment_com_github_Muserk_socketio_client_main_jar/` folder, run the command: `java -jar socket.io-appointment-com.github.Muserk.socketio.client_main.jar`

As soon as the Java client connects to the Node server, the server will send a series of events to initiate the Create, Update, and Delete methods for Patients, Appointments, and Services.

----------

## Payloads

The following JSON payloads are sent via socket IO. These can be used to test the client using your method of choice. 

#### Patient Model

    {
        'id':4437c452-3f54-11e7-a919-92ebcb67fe33, 
        'firstName':'Gavin', 
        'lastName':'Servai', 
        'phoneNumber':'6049999999'
    }

#### Appointment Model

    {
        'id':043d24e1-55dd-4108-8a8f-0f041cce4475, 
        'startDate':'2017-10-10', 
        'endDate':'2017-10-20', 
        'patientId':'8954'
    }
    
#### Service Model

    {
        'id':432973d5-c6cd-45f5-8156-aa848e6dc848, 
        'name':'test-service', 
        'duration':'24'
    }

