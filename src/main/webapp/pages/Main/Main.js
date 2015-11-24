Application.$controller("MainPageController", ["$scope", function ($scope) {
    "use strict";

    /* perform any action with the variables inside this block(on-page-load) */
    $scope.onPageVariablesReady = function () {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. $scope.Variables.staticVariable1.getData()
         */
    };
    
    /* perform any action with widgets inside this block */
    $scope.onPageReady = function () {
        /*
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. $scope.Widgets.byId(), $scope.Widgets.byName()or access widgets by $scope.Widgets.widgetName
         */
    };


        $scope.gridCombinedSetTheorySelect = function($event, $data){ 

        };
 
    }
]);

Application.$controller("gridNumberOfSystemsMainController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("gridNumberOfProdMessagesAllMainController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("gridNumberOfUATMessagesAllMainController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("gridCombinedSetTheoryController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);











Application.$controller("coreSystemSelectMainController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("gridVenMainController", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);

Application.$controller("grid3Controller", ["$scope",
	function($scope) {
		"use strict";
		$scope.ctrlScope = $scope;
	}
]);