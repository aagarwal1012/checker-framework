import android.support.annotation.*;

public class FollowCallStack {
    @UiThread
    void onUiThread() {}

    void unannotatedCallsUiThread() {
        // ::  error: (call.invalid.effect)
        onUiThread();
    }

    @WorkerThread
    void onWorkerThread() {}

    @WorkerThread
    void testMethodAnnotations() {

        // ::  error: (call.invalid.effect)
        onUiThread();

        // TODO: it should give error, but currently it do not.
        unannotatedCallsUiThread();

        // ok
        onWorkerThread();
    }
}
