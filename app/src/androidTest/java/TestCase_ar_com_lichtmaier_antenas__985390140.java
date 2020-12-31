import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas__985390140 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Lifecycle.class);
      Object var1 = null;
      ((Lifecycle)var2).removeObserver((LifecycleObserver)var1);
   }
}
