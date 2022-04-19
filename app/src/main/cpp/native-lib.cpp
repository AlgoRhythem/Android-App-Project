#include <jni.h>
#include <string>
using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_renee_finalprojectapp_Splash_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    string splashname = "Remember When?";
    return env->NewStringUTF(splashname.c_str());
}