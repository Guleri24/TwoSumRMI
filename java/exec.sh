alacritty -e bash -c "cat logo.txt && java Server.java;read;" &
alacritty -e bash -c "java Client.java;read;";
