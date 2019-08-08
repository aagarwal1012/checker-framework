import android.support.annotation.*;

public class FollowCallStack {
    @UiThread
    void onUiThread() {}

    void unannotatedCallsUiThread() {
        // ::  error: (call.invalid.effect)
        onUiThread();
    }

    @AnyThread
    void onAnyThread() {}

    @WorkerThread
    void onWorkerThread() {}

    @WorkerThread
    void testMethodAnnotations() {

        // ::  error: (call.invalid.effect)
        onUiThread();

        // ok
        unannotatedCallsUiThread();

        // ok
        onAnyThread();

        // ok
        onWorkerThread();
    }
}
