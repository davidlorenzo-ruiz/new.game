<html>
<head>

    <title>JavaScript Snake</title>
    <link rel="stylesheet" type="text/css" href="./css/snake.css">
</head>
<body style="background-color: rgb(252, 84, 84);">
    <div id="game-area" tabindex="0" class="snake-game-container" style="left: 0px; top: 0px; width: 145px; height: 774px;">
    <div id="playingField" class="snake-playing-field" style="left: 20px; top: 20px; width: 100px; height: 700px;"></div><div class="snake-panel-component" style="top: 732px; width: 450px; left: -152px; display: none;"><a href="http://patorjk.com/blog/software/" class="snake-link">more patorjk.com apps</a> - <a href="https://github.com/patorjk/JavaScript-Snake" class="snake-link">source code</a></div><div class="snake-panel-component" style="top: 732px; left: 25px;">Length: 1</div><div id="sbWelcome0" class="snake-welcome-dialog" style="z-index: 1000;"><div>JavaScript Snake<p></p>Use the <strong>arrow keys</strong> on your keyboard to play the game. On Windows, press F11 to play in Full Screen mode.<p></p></div><button>Play Game</button></div><div id="sbTryAgain0" class="snake-try-again-dialog"><div>JavaScript Snake<p></p>You died :(.<p></p></div><button>Play Again?</button></div><div class="snake-snakebody-block snake-snakebody-alive" style="left: 40px; top: 40px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div class="snake-snakebody-block" style="left: -1000px; top: -1000px; width: 20px; height: 20px;"></div><div id="snake-food-0" class="snake-food-block" style="width: 20px; height: 20px; left: 100px; top: 480px;"></div></div>
    <script type="text/javascript" src="./js/snake.js"></script>
    <script type="text/javascript">
    var mySnakeBoard = new SNAKE.Board(  {
                                            boardContainer: "game-area",
                                            fullScreen: true
                                        });    
    </script>

</body>
</html>