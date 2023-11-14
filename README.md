
// for textView
adb -s emulator-5554 shell am start
-a android.intent.action.VIEW
"https://just_code.kz/main?message=Hello_just_code" kz.just_code.deeplinks

//for button
adb -s emulator-5554 shell am start
-a android.intent.action.VIEW
"https://just_code.kz/main?btn=Hello_just_code" kz.just_code.deeplinks


