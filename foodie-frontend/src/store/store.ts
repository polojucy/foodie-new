import { GlobalStateProps } from "@/props/props";
import { createStore } from "vuex";

const store = createStore<GlobalStateProps>({
  state: {
    count: 1
  },
  mutations: {
    increment (state) {
      state.count++
    }
  },
})

export default store