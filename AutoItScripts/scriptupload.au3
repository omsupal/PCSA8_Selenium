#Region ;**** Directives created by AutoIt3Wrapper_GUI ****
#AutoIt3Wrapper_Compile_Both=y
#AutoIt3Wrapper_UseX64=y
#EndRegion ;**** Directives created by AutoIt3Wrapper_GUI ****
ControlFocus("Open","","Edit1")
ControlSetText("Open","","Edit1",$CmdLine[1])
ControlClick("Open","","Button1")