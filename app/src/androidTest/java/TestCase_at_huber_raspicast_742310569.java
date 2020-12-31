import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_huber_raspicast_742310569 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LayoutInflater.class);
      Object var1 = EasyMock.createMock(ViewGroup.class);
      View var3 = ((LayoutInflater)var2).inflate(2130903048, (ViewGroup)var1, false);
      var3 = var3.findViewById(2131427355);
      SwipeRefreshLayout var4 = (SwipeRefreshLayout)var3;
      int[] var5 = new int[1];
      var4.setColorSchemeResources(var5);
   }
}
