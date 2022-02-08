export const api = (() => {
    const url = 'https://lab1-arep.herokuapp.com/'
    return{
        cTof: async celsius =>{
            return await fetch('${url}/celsius/${celsius}').then(
                res => {
                    return res.json();
                }
            );
        },
        fToc: async fahrenheit =>{
            return await fetch('${url}/fahrenheit/${fahrenheit}').then(
                res => {
                    return res.json();
                });
        },
    };
})();