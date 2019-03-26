'use strict'
var app = angular.module("NoteManagement", []);

//Controller Part
app.controller("NotesController", function($scope, $http) {

    $scope.notes = [];
    $scope.noteForm = {
        noteId : -1,
        noteDescription : ""
    };

    //Now load the data from server
    _refreshNoteData();

    //HTTP POST/PUT methods for add/edit note
    // with the help of noteId, we are going to find out whether it is put or post operation

    $scope.submitNote = function() {

        var method = "";
        var url = "";
        if ($scope.noteForm.noteId == -1) {
            //Id is absent in form data, it is create new note operation
            method = "POST";
            url = 'http://localhost:8080/note/saveNote';
        } else {
            //Id is present in form data, it is edit note operation
            method = "PUT";
            url = 'http://localhost:8080/note/saveNote';
        }

        $http({
            method : method,
            url : url,
            data : angular.toJson($scope.noteForm),
            headers : {
                'Content-Type' : 'application/json'
            }
        }).then( _success, _error );
    };

    // In case of edit, populate form fields and assign form.noteId with note noteId
    $scope.editNote = function(note) {

        $scope.noteForm.noteDescription = note.noteDescription;
        $scope.noteForm.noteId = note.noteId;
    };

    /* Private Methods */
    //HTTP GET- get all notes collection
    function _refreshNoteData() {
        $http({
            method : 'GET',
            url : 'http://localhost:8080/note/getAllNotes'
        }).then(function successCallback(response) {
            $scope.notes = response.data;
        }, function errorCallback(response) {
            console.log(response.statusText);
        });
    }

    function _success(response) {
        _refreshNoteData();
        _clearFormData()
    }

    function _error(response) {
        console.log(response.statusText);
    }

    //Clear the form
    function _clearFormData() {
        $scope.noteForm.noteId = -1;
        $scope.noteForm.noteDescription = "";

    };
});