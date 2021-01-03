import android.support.v7.widget.RecyclerView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B_1418309432 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(RecyclerView.class);
      Object var1 = null;
      ((RecyclerView)var2).removeCallbacks((Runnable)(new Runnable() {public void run() {}}));
   }
}
