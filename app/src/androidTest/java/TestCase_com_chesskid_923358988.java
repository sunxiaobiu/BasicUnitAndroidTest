import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.transition.Scene;
import android.view.ViewGroup;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_chesskid_923358988 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewGroup.class);
      Object var1 = EasyMock.createMock(FragmentActivity.class);
      Scene.getSceneForLayout((ViewGroup)var0, 2131361858, (Context)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
