{"changed":true,"filter":false,"title":"game.java","tooltip":"/game.java","value":"<html><head>\n\n    <title>JavaScript Snake</title>\n    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/snake.css\">\n</head>\n<body style=\"background-color: rgb(252, 84, 84);\">\n    <div id=\"game-area\" tabindex=\"0\" class=\"snake-game-container\" style=\"left: 0px; top: 0px; width: 145px; height: 774px;\">\n    <div id=\"playingField\" class=\"snake-playing-field\" style=\"left: 20px; top: 20px; width: 100px; height: 700px;\"></div><div class=\"snake-panel-component\" style=\"top: 732px; width: 450px; left: -152px; display: none;\"><a href=\"http://patorjk.com/blog/software/\" class=\"snake-link\">more patorjk.com apps</a> - <a href=\"https://github.com/patorjk/JavaScript-Snake\" class=\"snake-link\">source code</a></div><div class=\"snake-panel-component\" style=\"top: 732px; left: 25px;\">Length: 1</div><div id=\"sbWelcome0\" class=\"snake-welcome-dialog\" style=\"z-index: 1000;\"><div>JavaScript Snake<p></p>Use the <strong>arrow keys</strong> on your keyboard to play the game. On Windows, press F11 to play in Full Screen mode.<p></p></div><button>Play Game</button></div><div id=\"sbTryAgain0\" class=\"snake-try-again-dialog\"><div>JavaScript Snake<p></p>You died :(.<p></p></div><button>Play Again?</button></div><div class=\"snake-snakebody-block snake-snakebody-alive\" style=\"left: 40px; top: 40px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div id=\"snake-food-0\" class=\"snake-food-block\" style=\"width: 20px; height: 20px; left: 100px; top: 480px;\"></div></div>\n    <script type=\"text/javascript\" src=\"./js/snake.js\"></script>\n    <script type=\"text/javascript\">\n    var mySnakeBoard = new SNAKE.Board(  {\n                                            boardContainer: \"game-area\",\n                                            fullScreen: true\n                                        });    \n    </script>\n\n</body></html>","undoManager":{"mark":-2,"position":0,"stack":[[{"start":{"row":0,"column":0},"end":{"row":16,"column":14},"action":"insert","lines":["<html><head>","","    <title>JavaScript Snake</title>","    <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/snake.css\">","</head>","<body style=\"background-color: rgb(252, 84, 84);\">","    <div id=\"game-area\" tabindex=\"0\" class=\"snake-game-container\" style=\"left: 0px; top: 0px; width: 145px; height: 774px;\">","    <div id=\"playingField\" class=\"snake-playing-field\" style=\"left: 20px; top: 20px; width: 100px; height: 700px;\"></div><div class=\"snake-panel-component\" style=\"top: 732px; width: 450px; left: -152px; display: none;\"><a href=\"http://patorjk.com/blog/software/\" class=\"snake-link\">more patorjk.com apps</a> - <a href=\"https://github.com/patorjk/JavaScript-Snake\" class=\"snake-link\">source code</a></div><div class=\"snake-panel-component\" style=\"top: 732px; left: 25px;\">Length: 1</div><div id=\"sbWelcome0\" class=\"snake-welcome-dialog\" style=\"z-index: 1000;\"><div>JavaScript Snake<p></p>Use the <strong>arrow keys</strong> on your keyboard to play the game. On Windows, press F11 to play in Full Screen mode.<p></p></div><button>Play Game</button></div><div id=\"sbTryAgain0\" class=\"snake-try-again-dialog\"><div>JavaScript Snake<p></p>You died :(.<p></p></div><button>Play Again?</button></div><div class=\"snake-snakebody-block snake-snakebody-alive\" style=\"left: 40px; top: 40px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div class=\"snake-snakebody-block\" style=\"left: -1000px; top: -1000px; width: 20px; height: 20px;\"></div><div id=\"snake-food-0\" class=\"snake-food-block\" style=\"width: 20px; height: 20px; left: 100px; top: 480px;\"></div></div>","    <script type=\"text/javascript\" src=\"./js/snake.js\"></script>","    <script type=\"text/javascript\">","    var mySnakeBoard = new SNAKE.Board(  {","                                            boardContainer: \"game-area\",","                                            fullScreen: true","                                        });    ","    </script>","","</body></html>"],"id":1}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":16,"column":14},"end":{"row":16,"column":14},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1569279751654}