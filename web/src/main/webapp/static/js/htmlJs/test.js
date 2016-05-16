/**
 * Created by Administrator on 2015/12/1.
 */
'use strict';

/* App Module */
var modelApp = angular.module('modelApp', []);

modelApp.config(function($interpolateProvider) {
    $interpolateProvider.startSymbol('[[');
    $interpolateProvider.endSymbol(']]');
});

/* 自定义过滤器 */
modelApp.filter('myfilter', function() {
    return function(input) {
        if(input.indexOf("--")>0){
            input=input.replace("--","~");
        }
        return input;
    }

});

function modelListCtrl ($scope, $http) {

    $scope.show=function(){
        testService.get({},function(data){
            $scope.fruits = data.bizData;
            //alert(JSON.stringify($scope.fruits));
        });
        //$scope.fruits = list;
        //bool = !bool;
    }

    $scope.submit=function(){
        if($scope.name==undefined||$scope.name==''){
            alert("名字不能为空！");
            return ;
        }
        if($scope.price==undefined||$scope.country==''){
            alert("价格不能为空！");
            return ;
        }
        if($scope.country==undefined||$scope.country==''){
            alert("产地不能为空！");
            return ;
        }
        var jsondata = {
            name:$scope.name,
            price:$scope.price,
            country:$scope.country
        };
        testService.post(jsondata,function(data){
            alert("success");
        });
    }

    $scope.showForm=function() {
        $scope.Form = !$scope.Form;
    }

    function init() {
        $scope.Form = false;
        testService = new TestServices($http);
        list = [{name:"apple",price:"12",country:"China"},
                    {name:"banana",price:"14",country:"Afrian"},
                    {name:"watermelon",price:"16",country:"Japan"}];
    }

    var bool = false;
    var list = [];
    var testService;
    init();



}