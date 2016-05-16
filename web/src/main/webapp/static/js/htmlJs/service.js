function TestServices($http){
    //get方法
    this.get = function(jsonData, successCallback, errCallback){
        if($http!=undefined){
            var p = $http({
                method : 'get',
                url : '/test/returnjson?format=json',
                params : jsonData,
                headers : {
                    contentType : 'application/json;charset=UTF-8'
                }
            });
            p.success(function(data, status) {
                if(typeof successCallback === 'function')
                    successCallback(data, status);
            });
            p.error(function(data, status) {
                if(typeof errCallback === 'function')
                    errCallback(data, status);
            });
        }
        //else{
        //    $.ajax({
        //        method : 'get',
        //        url : url,
        //        data: jsonData,
        //        success: function(data, status){
        //            if(typeof successCallback === 'function')
        //                successCallback(data, status);
        //        },
        //        error:function(data, status){
        //            if(typeof errCallback === 'function')
        //                errCallback(data, status);
        //        }
        //    });
        //}
    }

    this.post = function(jsonData, successCallback, errCallback) {
        if ($http != undefined) {
            var p = $http({
                method: 'post',
                url: '/test/insertFruit/',
                data: jsonData,
                headers: {
                    contentType: 'application/json;charset=UTF-8'
                }
            });
            p.success(function (data, status) {
                if (typeof successCallback === 'function')
                    successCallback(data, status);
            });
            p.error(function (data, status) {
                if (typeof errCallback === 'function')
                    errCallback(data, status);
            });
        }
    }

    this.up
}