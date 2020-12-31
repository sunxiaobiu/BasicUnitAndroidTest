import android.location.LocationListener;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers__1915726773 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(LocationListener.class);
      String var1 = "android";
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Bundle.class);
      ((LocationListener)var4).onStatusChanged(var1, var2, (Bundle)var3);
   }
}
