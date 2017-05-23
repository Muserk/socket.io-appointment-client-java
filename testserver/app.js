// Server
var io = require('socket.io').listen(8500);

var patientMock = "{'id':4437c452-3f54-11e7-a919-92ebcb67fe33, 'firstName':'Gavin', 'lastName':'Servai', 'phoneNumber':'6045062311'}";
var appointmentMock = "{'id':043d24e1-55dd-4108-8a8f-0f041cce4475, 'startDate':'2017-10-10', 'endDate':'2017-10-20', 'patientId':'8954'}";
var serviceMock = "{'id':432973d5-c6cd-45f5-8156-aa848e6dc848, 'name':'test-service', 'duration':'24'}";

io.on('connection', function(socket) {
  console.log('Client Connected');

  socket.emit('CREATE/Patient', patientMock);
  socket.emit('UPDATE/Patient', patientMock);
  socket.emit('DELETE/Patient', patientMock);

  socket.emit('CREATE/Appointment', appointmentMock);
  socket.emit('UPDATE/Appointment', appointmentMock);
  socket.emit('DELETE/Appointment', appointmentMock);

  socket.emit('CREATE/Service', serviceMock);
  socket.emit('UPDATE/Service', serviceMock);
  socket.emit('DELETE/Service', serviceMock);

});


