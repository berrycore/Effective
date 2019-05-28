package chapter18_use_interface_rather_than_abstract_class;

public interface SingSongwriter extends Singer , Songwriter {
    AudioClip strum();
    void actSensitive();
}
