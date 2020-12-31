import android.support.v4.app.Fragment;
import android.transition.TransitionSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_spark_post__702188221 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Fragment.class);
      Object var1 = EasyMock.createMock(TransitionSet.class);
      ((Fragment)var2).setSharedElementEnterTransition(var1);
   }
}
