import android.transition.TransitionManager;
import android.util.ArrayMap;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_aliexpress_itao__456882823 {
   @Test
   public void testCase() throws Exception {
      Class var2 = TransitionManager.class;
      Field var3 = var2.getDeclaredField("sRunningTransitions");
      Object var4 = var3.get(TransitionManager.class);
      ThreadLocal var5 = (ThreadLocal)var4;
      var4 = var5.get();
      WeakReference var6 = (WeakReference)var4;
      var4 = var6.get();
      ArrayMap var7 = (ArrayMap)var4;
      Object var1 = EasyMock.createMock(View.class);
      var7.containsKey(var1);
   }
}
